package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.model.comparator.AscCategory;
import com.ohgiraffers.test.model.comparator.DescCategory;
import com.ohgiraffers.test.model.dto.BookDTO;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class BookManager {

    ArrayList<BookDTO> booklist = new ArrayList<BookDTO>();
    public BookManager (){
        this.booklist = new ArrayList<BookDTO>();

    }
    public void addBook (){

        booklist.add(new BookDTO());

    }
    public void deleteBook(int index){

        booklist.remove(index);

    }

    public void searchBook(String title) {

        for (int i = 0; booklist.size(); i++){
            if (booklist.contains(title)) {
                System.out.println( );
            }else {
                System.out.println("조회되는 목록이 없습니다.");
            }

        }
    }

    public void printBook(int index){

        System.out.println(index);

    }


    public void displayAll() {

        System.out.println(booklist);
    }

    public ArrayList<BookDTO> sortedBookList(int select){

        if(select == 1){
            booklist.sort(new AscCategory());

        }else {
            booklist.sort(new DescCategory());
        }

        return booklist;

        }
    public void printBooklist(){

        for(BookDTO book: booklist){
            System.out.println(book);

        }



    }

}






