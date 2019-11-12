/*
2. The Perfect Team
The School of Languages and Science teaches five subjects: Physics, Chemistry, Math, Botany, and Zoology.
Each student is skilled in one subject.
The skills of the students are described by string of named skills that consists of the letters p, c, m, b, and z only.
Each character describes the skill of a student as follows:

p → Physics.
c → Chemistry.
m → Math.
b → Botany.
z → Zoology.

Your task is to determine the total number of different teams satisfying the following constraints:

A team consists of a group of exactly five students.
Each student is skilled in a different subject.
A student may only be on one team.
For instance, if the skills string is pcmbzpcmbz then there are two possible
teams that can be formed at one time: skills[0-4] and skills[5-9] for example.
It is not important to determine permutations as we will always be limited to
two teams given 10 students.

Function Description

Complete the function differentTeams in the editor below.
The function must return an integer value representing the number of teams that
can be formed given the constraints.

differentTeams has the following parameter(s):

    skills:  a string where each position represents the skill of a student

 */
package pagseguro;

import java.util.ArrayList;

/**
 *
 * @author Sakemi
 */
public class Teams {

    static int differentTeams2(String skills) {
        ArrayList<String> teams = new ArrayList<>();
        int[] present = new int[5];
        teams.add("");

        for (int i = 0; i < skills.length(); i++) {

            String skill = skills.substring(i, i + 1);
            String team;
            switch (skill) {

                case "p":
                    if (present[0] == teams.size() - 1) {
                        teams.add("");
                    }
                    team = teams.get(present[0]) + skill;
                    teams.set(present[0], team);
                    present[0]++;
                    break;
                case "c":
                    if (present[1] == teams.size() - 1) {
                        teams.add("");
                    }
                    team = teams.get(present[0]) + skill;
                    teams.set(present[0], team);
                    present[1]++;
                    break;
                case "m":
                    if (present[2] == teams.size() - 1) {
                        teams.add("");
                    }
                    team = teams.get(present[0]) + skill;
                    teams.set(present[0], team);
                    present[2]++;
                    break;
                case "b":
                    if (present[3] == teams.size() - 1) {
                        teams.add("");
                    }
                    team = teams.get(present[0]) + skill;
                    teams.set(present[0], team);
                    present[3]++;
                    break;
                case "z":
                    if (present[4] == teams.size() - 1) {
                        teams.add("");
                    }
                    team = teams.get(present[0]) + skill;
                    teams.set(present[0], team);
                    present[4]++;
                    break;
                default:

            }

        }
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).length() < 5) {
                teams.remove(i);
                i--;
            }
        }

        return teams.size();
    }

    static int differentTeams(String skills) {
        ArrayList<String> teams = new ArrayList<>();
        teams.add("");

        for (int i = 0; i < skills.length(); i++) {

            String skill = skills.substring(i, i + 1);

            for (int j = 0; j < teams.size(); j++) {

                String team = teams.get(j);

                if (!team.contains(skills.substring(i, i + 1))) {
                    team += skill;
                    teams.set(j, team);
                    break;
                } else if (j == teams.size() - 1) {
                    teams.add(skill);
                    break;
                }
            }
        }

        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).length() < 5) {
                teams.remove(i);
                i--;
            }
        }

        return teams.size();
    }

    public static void main(String[] args) {

        String input = "pcmpcmbbbzz";

        System.out.println(differentTeams2(input));

    }

}
