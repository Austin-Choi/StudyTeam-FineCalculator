package data;

import util.Console;

import java.time.LocalTime;

public class TeamMate {
    private String name;
    private LocalTime checkIn;
    private int lateFine = 0;
    private int totalFine = 0;

    public TeamMate(){
        System.out.println("이름을 입력하세요.");
        this.name = Console.readLine();
        this.checkIn = LocalTime.now();
        this.lateFine = 0;
        this.totalFine = 0;
    }
    public String getName(){
        return this.name;
    }
    //처음 시작할때 startDate 가져오기
    public void setLateFine(LocalTime startDate){
        int min = this.checkIn.getMinute() - startDate.getMinute();
        this.lateFine = 100*min;
        //오후 4시와 비교해서 1분당 100원 해서
        //totalFine에 +=
    }
    public int getLateFine(){
        return this.lateFine;
    }
    //0이면 안한거 1이면 한거
    public void addCSFine(String command){
        if(command.equals("0"))
            totalFine += 2000;
    }
    public void addAlgoFine(String amount){
        int question = Integer.parseInt(amount);
        totalFine += 1000 * question;
    }
}
