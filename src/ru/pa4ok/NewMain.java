package ru.pa4ok;

public class NewMain
{
    public static final String APP_TITLE = "454545";

    public static void main(String[] args)
    {
        Library library = new Library(new Book("ioreghireughr"));

        //перезаписать финальную книгу нельзя
        //library.book = new Book("gfeegreg");

        //но изменить ее поля можно спокойно
        library.book.title = "gfeegreg";
    }
}

/*
    final переменная объявляется 1 раз
    и больше ее перезаписать нельзя
 */

class Test
{
    public final String testString;

    //объявить ее можно либо в конструкторе
    public Test() {
        this.testString = "ouewfhef";
    }

    public void testMethod()
    {
        //изменить final переменную уже нельзя
        //testString = "433433";
    }
}

class Test2
{
    //либо сразу в поле класса
    public final String testString = "ouewfhef";;

    public Test2() {
    }
}

class Test3
{
    //для статики тоже самое
    //либо объявить сразу
    public static final String s = "oweofewjew";
}

class Test4
{
    public static final String s;

    //либо в статичном блоке
    static {
        s = "oweofewjew";
    }
}

/*
все final переменные должны быть инициализированы
при вызове любого из конструторов
 */
class Test5
{
    private final int i;
    private final int j;

    public Test5(int i, int j) {
        this.i = i;
        this.j = j;
    }

    //ошибка
    /*public Test5(int i) {
        this.i = i;
    }*/

    public Test5(int i) {
        this(i, -1);
    }
}

class Book
{
    public String title;

    public Book(String title) {
        this.title = title;
    }
}

class Library
{
    public final Book book;

    public Library(Book book) {
        this.book = book;
    }
}

