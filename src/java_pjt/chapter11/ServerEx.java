package java_pjt.chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
    public static void main(String[] args) {
        ServerSocket serverSocket = null; // 서버 소켓
        Socket socket = null; // 클라이언트 소켓
        BufferedReader br = null; // 입력 : 클라이언트에서 들어오는 데이터
        BufferedWriter wr = null; // 출력 : 서버에서 보내는 데이터
        Scanner sc = new Scanner(System.in);

        try {
            serverSocket = new ServerSocket(36223);
            System.out.println("연결 기다리는 중");
//            소켓 객체로 데이터를 주고 받음
            socket = serverSocket.accept(); // 클라이언트 연결 대기
//            입력 : 클라이언트에서 들어오는 데이터
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            출력 : 서버에서 보내는 데이터
            wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true) {
                String inputMessage = br.readLine(); // 한행의 문자열을 읽음
                if (inputMessage.equals("bye")) {
                    System.out.println("클라이언트에서 bye로 연결을 종료함");
                    break;
                }
                System.out.println("클라이언트 : " + inputMessage); // 클라이언트에서 온 메세지
                System.out.print("보내기 >> ");
                String outputMessage = sc.nextLine(); // 서버에서 보내는 메세지
                wr.write(outputMessage + "\n"); // 클라이언트로 메세지 보내기
                wr.flush(); // 비정상적인 종료일 때 메세지 전송

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
