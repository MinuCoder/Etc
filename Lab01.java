import java.util.Scanner;

/**
 * Created by 민우 on 2017-07-06.
 */
public class Lab01 {
    static void mainMenu(){
        // Main Menu
        String sellect[] = {"I", "i", "C", "c", "E", "e"};
        System.out.print("("+sellect[0]+")ntro ");
        System.out.print("("+sellect[2]+")ourses ");
        System.out.println("("+sellect[4]+")xit ");
    }
    static void courses(){
        //Courses
        String Courses[] = {"P", "p", "J", "j", "i", "I", "B", "b"};
        System.out.print("("+Courses[0]+")ython ");
        System.out.print("("+Courses[2]+")ava ");
        System.out.print("("+Courses[4]+")OS ");
        System.out.println("("+Courses[6]+")ack ");
    }
    public static void main(String args[]){
        String choise = "";
        String subject = "";
        while (true){
            // Main Menu Sellect
            mainMenu();
            Scanner sc = new Scanner(System.in);
            choise = sc.next();

            // Case I or i
            if (choise.equals("I")||choise.equals("i")) {
                System.out.println("안녕하세요! 우리는 코드잇입니다.");
                System.out.println("함께 공부합시다!");
            }
            // Case C or c
             else if (choise.equals("C")||choise.equals("c")) {
                while (true) {
                    System.out.println("코드잇 수업을 소개합니다.");
                    courses();
                    Scanner sc1 = new Scanner(System.in);
                    subject = sc1.next();
                        //Courses
                        if (subject.equals("P") || subject.equals("p")) {
                            System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.");
                            System.out.println("강사: 강영훈");
                            System.out.println("추천 선수과목: 없음");
                        } else if (subject.equals("J") || subject.equals("j")) {
                            System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.");
                            System.out.println("강사: 김신의");
                            System.out.println("추천 선수과목: Python");
                        } else if (subject.equals("i") || subject.equals("I")) {
                            System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.");
                            System.out.println("강사: 성태호");
                            System.out.println("추천 선수과목: Python, Java");
                        } else if (subject.equals("B") || subject.equals("b")) {
                            break;
                        }
                }
            }
            else if (choise.equals("E")||choise.equals("e")){
                System.out.println("안녕히 가세요.");
                break;
            }
        }
    }
}
