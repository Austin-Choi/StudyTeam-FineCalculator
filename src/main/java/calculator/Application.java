package calculator;

import data.TeamMate;

import java.time.LocalTime;

public class Application {
    public static final int TEAM_SIZE = 6;
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        TeamMate[] team = new TeamMate[TEAM_SIZE];

        //입장
        System.out.println("벌금계산기 시작 4시");
        for(int i = 0; i<TEAM_SIZE; i++){
            TeamMate person = new TeamMate();
            person.setLateFine(start);
            team[i] = person;
        }

        //지각벌금 계산
        int totalLateFine = 0;
        for(TeamMate tm : team){
            totalLateFine += tm.getLateFine();
        }
        System.out.println(team[TEAM_SIZE-1].getName()+"의 지각벌금 : "+totalLateFine+"원.");

        //TODO: CS벌금, 알고리즘 문제 벌금 로직 추가
    }
}
