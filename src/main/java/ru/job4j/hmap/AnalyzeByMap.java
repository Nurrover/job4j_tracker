package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double avg = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                avg += subject.score();
                count++;
            }
        }

        return avg / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double avg = 0;
            int count = pupil.subjects().size();
            for (Subject subject : pupil.subjects()) {
                avg += subject.score();
            }
            list.add(new Label(pupil.name(), avg / count));
        }
        return list;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                linkedHashMap.merge(subject.name(), subject.score(), Integer::sum);
            }
        }

        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                list.add(new Label(subject.name(), linkedHashMap.get(subject.name()) / pupils.size()));
            }
        }

        return list;

    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double avg = 0;
            for (Subject subject : pupil.subjects()) {
                avg += subject.score();
            }
            list.add(new Label(pupil.name(), avg));
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), Integer::sum);
            }
        }

        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                list.add(new Label(subject.name(), map.get(subject.name())));
            }
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }
}
