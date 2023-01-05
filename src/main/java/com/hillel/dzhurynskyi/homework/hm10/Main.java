package com.hillel.dzhurynskyi.homework.hm10;


public class Main {
    public static void main(String[] args){

        FileNavigator fileNavigator=new FileNavigator();

        FileData file1 = new FileData("/path/to/file1",5,"GG456856.txt");
        FileData file2 =new FileData("/path/to/file1",3,"GG145655.txt");
        FileData file3 =new FileData("/path/to/file2",1,"GG5456.txt");
        FileData file4 =new FileData("/path/to/file2",4,"GG555256.txt");


        fileNavigator.add("/path/to/file1",file1);
        fileNavigator.add("/path/to/file1",file2);
        fileNavigator.add("/path/to/file2",file3);
        fileNavigator.add("/path/to/file2",file4);

        System.out.println(fileNavigator);
        System.out.println();
        System.out.println(fileNavigator.find("/path/to/file2"));
        System.out.println();
        System.out.println(fileNavigator.filterBySize(4));
        System.out.println();
        System.out.println(fileNavigator.sortBySize());
        System.out.println();
        fileNavigator.remove("/path/to/file2");
        System.out.println(fileNavigator);



    }
}
