package com.company.first;

import java.awt.*;
import java.awt.event.*;

class Party {
    public void buildInvite() {
        Frame f = new Frame();
        Label l = new Label("Tim's party");
        Button b = new Button("Your rate");
        Button c = new Button("Discard");
        Panel p = new Panel();
        p.add(l);
    }

    public static void main(String[] args) {
        int size = 27;                  //объявляем целочилсенную переменную size и присваиваем ей значение 27
        String name = "Fido";           //объявляем строковую переменную name и присваиваем ей значение Fido
//        Dog myDog = new Dog(name, size);    //создаём объект (как экземпляр класса, только у объектов) myDog от объекта Dog и присваиваем его двум полям два значения
        x = size - 5;                   //создаём переменную x и присваиваем ей вычитание size - 5
        if (x < 15) myDog.bark(8);       //проверем, если x < 15 то выполнить метод лай объекта myDog в размере 8 или 8 раз

        while (x > 3) {     //цикл пока x будет больше 3
            myDog.play();   //выполняется метод play объекта myDog
        }

        int[] numList = {2,4,6,8};  //объявляем массив numList со значениями 2, 4, 6, 8
        System.out.print("Hello");   //вывыодим в консоль надпись Hello
        System.out.print("Dog: " + name);   //выводим в консоль надпись Dog: Fido
        String num = "8";       //объявляем строковую переменную num со значением 8
        int z = Integer.parseInt(num);   //объявляем переменную z и присваиваем ей переменную num, преобразованную в целочисленный типа данных

        try {     //попытаться выоплнить
            readTheFile("myFile.txt");   //прочитать файл myFile.txt
        }

        catch (FileNotFoundException ex) {      //в случае если файл не найден, поймать ошибку и выполнить код в скобках
            System.out.print("File not found.");   //вывести в консоль File not found
        }




    }
}