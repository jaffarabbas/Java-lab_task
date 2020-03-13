/******************************************************************************

 Lab Task:

 Task 4:

 Create a class PSLteams with attributes such as teamName, playerNames, Rank, NoOfMatchesPlayed,
 NoOfMatchesWon, MatchesLost etc. Apply access modifiers so that
 - fields can not be changed but can be viewed.
 - methods can be accessed from anywhere.
 Design a constructor to add information of team etc. name, player names and rank , set matches played, won and lost
 to 0. Design method playmatch() which takes a single parameter bstatusb which can be true or false, where true
 indicates winning and false means that team has lost the match. No. of matches played, match won and lost should
 automatically be maintained whenever there is a match played. User will be able to view updated information at any
 time.
 Design a class PSLteams2019 as test class. Create objects for all PSLteams (KarachiKings, MultanSultan,
 IslamabadUnited, QuettaGliadiators and PeshawarZalmi). Call method playmatch() by every team and pass status.
 Check no. of matches played, won and lost.
 Bonus: Try to create a mechanism of auto ranking for bonus point

 *******************************************************************************/
import java.util.Random;

import java.util.Scanner;



class PSLteams
{


    //Variables

    private String TeamName;

    public int TeamNo;

    private String PlayerNames;

    private int Rank;

    private int NoOfMatchesPlayed;

    private int NoOfMatchesWon;
    private int MatchesLost;


    //constructor


    public PSLteams (String teamname, int teamno, String playernames)
    {
        TeamName = teamname;
        TeamNo = teamno;
        PlayerNames = playernames;
    }

    //methods

    public void playmatch(char status){
        if(status == 'T'){
            NoOfMatchesWon++;
            NoOfMatchesPlayed++;
        }

        else{
            MatchesLost++;
            NoOfMatchesPlayed++;

        }
    }

    public int GetDetail(){

        System.out.println("The name of team is "+TeamName);
        System.out.println(" The No of Team is "+TeamNo);
        System.out.println(" PlayerNames is "+PlayerNames);
        System.out.println("  NoOfMatchesPlayed is "+NoOfMatchesPlayed);
        System.out.println("   NoOfMatchesWon is "+NoOfMatchesWon);
        System.out.println("    MatchesLost is "+MatchesLost);
        return NoOfMatchesWon;
    }


}


public class Main
{


    public static void main (String[]args)
    {


        Random rang = new Random();
        Scanner scan = new Scanner(System.in);

        PSLteams KK =
                new PSLteams ("Karachi Kings", 1, "Imad Wasim (captain), Babar Azam, Mohammad Amir, Iftikhar Ahmed,\n Aamir Yamin, Usama Mir, Umer Khan, Alex Hales, Chris Jordan, Sharjeel Khan , Cameron Delport,\n Mohammad Rizwan, Umaid Asif,Chadwick Walton, Ali Khan, Arshad Iqbal,Mitch McClenaghan, Awais Zia");

        PSLteams IU =
                new PSLteams ("Islamabad United", 2, "Shadab Khan(captain), Faheem Ashraf, Asif Ali, Luke Ronchi,\n Hussain Talat, Amad Butt, Musa Khan, Dale Steyn,Colin Ingram, Colin Munro, Rumman Raees,\n  Rizwan Hussain,Phil Salt, Zafar Gohar, Akif Javed, Ahmed Safi Abdullah,Saif Badar, Dawid Malan.");

        PSLteams PZ =
                new PSLteams ("Peshawar Zalmi", 3,  "Darren Sammy (captain), Hasan Ali , Kieron Pollard (partial tournament),\n Wahab Riaz, Kamran Akmal, Imam-ul-Haq, Umar Amin, Tom Banton,Shoaib Malik,\n Liam Dawson, Mohammad Mohsin, Rahat Ali,Lewis Gregory, Adil Amin, Amir Khan, Aamir Ali,Liam Livingstone, Haider Ali,Carlos Brathwaite (partial tournament)");

        PSLteams QG =
                new PSLteams ("Quetta Gladiators", 4, "Sarfaraz Ahmed (captain), Mohammad Nawaz, Shane Watson,Ahmed Shehzad,\n Umar Akmal (suspended), Mohammad Hasnain,Ahsan Ali, Naseem Shah, Jason Roy,\n Ben Cutting,Fawad Ahmed, Sohail Khan, Tymal Mills, Abdul Nasir,Arish Ali Khan, Azam Khan, Keemo Paul (partial tournament),Khurram Manzoor, Zahid Mehmood (partial tournament),Anwar Ali");

        PSLteams LQ =
                new PSLteams ("Lahore Qalandars", 5, "Sohail Akhtar (captain), Fakhar Zaman, Mohammad Hafeez,Shaheen Shah Afridi,\n David Wiese, Usman Shinwari,Haris Rauf, Salman Butt, Chris Lynn, Samit Patel,Seekkuge Prasanna, Ben Dunk, Farzan Raja, Jaahid Ali,\n Muhammad Faizan, Dane Vilas, Dilbar Hussain.");

        PSLteams MS =
                new PSLteams ("Multan Sultans", 6, "Shan Masood (captain), Shahid Afridi, Mohammad Irfan,James Vince, Junaid Khan,\n Moeen Ali, Rilee Rossouw,Zeeshan Ashraf, Ravi Bopara, Sohail Tanvir, Ali Shafiq,Khushdil Shah,\n Usman Qadir,Fabian Allen (partial tournament), Mohammad Ilyas,Rohail Nazir, Imran Tahir, Bilawal Bhatti,Wayne Madsen (partial tournament)");

//match start

        for (int i = 0; i <= 30; i++) {
            int team1 = rang.nextInt(6) + 1;
            int team2 = rang.nextInt(6) + 1;
            int win = rang.nextInt(2);

            i = team1 == team2 ? i--: i ;

            //team 1
            char status = win == 0 ? 'T' : 'F';
            char statu = status == 'T' ? 'F': 'T';
            team2 = team2 * 10;

            switch(team1){
                case 1:
                    KK.playmatch(status);
                    break;
                case 2:
                    IU.playmatch(status);
                    break;
                case 3:
                    PZ.playmatch(status);
                    break;
                case 4:
                    QG.playmatch(status);
                    break;
                case 5:
                    LQ.playmatch(status);
                    break;
                case 6:
                    MS.playmatch(status);
                    break;
                //team 2

                case 10:
                    KK.playmatch(statu);
                    break;
                case 20:
                    IU.playmatch(statu);
                    break;
                case 30:
                    PZ.playmatch(statu);
                    break;
                case 40:
                    QG.playmatch(statu);
                    break;
                case 50:
                    LQ.playmatch(statu);
                    break;
                case 60:
                    MS.playmatch(statu);
                    break;
            }
        }

        int[] arr = new int[6];// for team ranks
        String[] array = {"Karachi Kings" , "Islamabad United" , "Multan Sultans" , "Quetta Gliadiators" , "Lahore Qalandars" , "Peshawar Zalmi"};
        int i = 0;

        arr[i++] = KK.GetDetail();
        arr[i++] = IU.GetDetail();
        arr[i++] = MS.GetDetail();
        arr[i++] = QG.GetDetail();
        arr[i++] = LQ.GetDetail();
        arr[i++] = PZ.GetDetail();

// for ranks loop start

        for (i=0; i<5; i++)
            for (int j=0; j<5-i; j++)
                if (arr[j] < arr[j+1]){
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    // Team

                    String temp1 = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp1;

                }
        System.out.println("\n\n\t\t\tThe Ranking of Teams are");
        for(i=0; i <=5; i++)
            System.out.println("The "+(i+1)+" Ranks of the team is "+array[i]+"With Total Win "+arr[i]);
    }


}



