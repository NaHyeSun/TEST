package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm;

    public BookMenu(){}

    public void menu(){

        while(true){

            System.out.println("=====도서관리 프로그램=====");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. 프로그램 종료하기 ");

            int index = sc.nextInt();

            if(index == 1){
                bm.addBook();
            }
            if(index == 2){
                bm.deleteBook(index);
            }
            if(index == 3){
                bm.searchBook(inputBookTitle());
            }
            if(index == 4){
                bm.printBook(index);
            }
            if(index == 5){
                bm.displayAll();
            }else{
                break;
            }

        }
        return;


    }

    public BookDTO inputBook(){
        System.out.println("도서 번호를 입력하세요");
        int bNo = sc.nextInt();
        System.out.println("도서 분류 코드를 입력하세요");
        int category = sc.nextInt();
        System.out.println("도서 제목을 입력하세요");
        String title = sc.nextLine();
        System.out.println("도서 저자를 입력하세요");
        String author = sc.nextLine();

        BookDTO bookDTO = new BookDTO(bNo,category,title,author);
        return new BookDTO();


    }

    public String inputBookTitle(){

        System.out.println("도서 제목을 입력하세요");
        String title = sc.nextLine();
        return title;
    }



}
