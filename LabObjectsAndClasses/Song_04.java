package LabObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song_04 {

    static class Song {
        String typeList;
        String name;
        String time;

        Song (String typeList, String name, String time){
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        String getName (){
            return this.name;
        }

        void setName (String name){
            this.name = name;
        }

        String getTypeList(){
            return this.typeList;
        }

        void setTypeList (String typeList){
            this.typeList = typeList;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int songNumbers = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 1; i <= songNumbers; i++) {
            String[] songData = scanner.nextLine().split("_");
            String typeList = songData[0];
            String name = songData[1];
            String time = songData[2];

            Song song = new Song(typeList, name, time);

            songs.add(song);
        }
        String typeList = scanner.nextLine();
        if (typeList.equals("all")){
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        }else {
            for (Song song : songs) {
                if (song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
