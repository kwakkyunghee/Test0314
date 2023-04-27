package hs.kr.study;

import hs.kr.study.beans.Music;
import hs.kr.study.beans.jpop;
import hs.kr.study.beans.kpop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml"); //xml파일을 읽는 코드.?
        Music N = ctx.getBean("M", kpop.class); //N객체에 M을 넣음
        Music G = ctx.getBean("H", jpop.class);

        N.sound(); //N객체 호출
        G.sound();

        ctx.close();
    }
}