package java_pjt.chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
    public static void main(String[] args) {
        ServerSocket serverSocket = null; // 서버 소켓
        Socket socket = null; // 클라이언트 소켓
        BufferedReader br = null; // 입력 : 클라이언트에서 들어오는 데이터
        BufferedWriter wr = null; // 출력 : 서버에서 보내는 데이터
        Scanner sc = new Scanner(System.in);

        try {
//            소켓 객체로 데이터를 주고 받음
//            서버 ip와 포트를 가지고 소켓객체 생성
            socket = new Socket("localhost", 36223);
//            입력 : 클라이언트에서 들어오는 데이터
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            출력 : 서버에서 보내는 데이터
            wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true) {
                System.out.print("보내기 >> ");
                String outputMessage = sc.nextLine(); // 서버에서 보내는 메세지
                if (outputMessage.equals("bye")) {
                    wr.write(outputMessage + "\n"); // 서버로 메세지 보내기
                    wr.flush(); // 비정상적인 종료일 때 메세지 전송
                    break;
                }
                wr.write(outputMessage + "\n"); // 서버로 메세지 보내기
                wr.flush(); // 비정상적인 종료일 때 메세지 전송
                String inputMessage = br.readLine(); // 한행의 문자열을 읽음
                System.out.println("서버 : " + inputMessage); // 서버에서 온 메세지
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            자원 반납
            try {
                sc.close();
                socket.close();
                serverSocket.close();
            } catch (Exception e2) { // 서버와 클라이언트 간에 입출력시 예외 발생
                System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
            }
        }
    }
}
