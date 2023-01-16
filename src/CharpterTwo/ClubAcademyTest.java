package CharpterTwo;

import java.util.Scanner;

public class ClubAcademyTest {
    public static void main(String[] args) {
        ClubAcademy club = new ClubAcademy();


        club.setName("Liverpool Football Club");
        String result = club.getName();
        System.out.printf("Club Name is: %s%n", result);
        System.out.println();

        club.setLocation(" Liverpool England ");
        result = club.getLocation();
        System.out.printf("Location is  Based in: %s%n ", result);
        System.out.println();


        club.setStadium("Anfield");
        result = club.getStadium();
        System.out.printf("Stadium Name is: %s%n", result);
        System.out.println();


        club.setCapacity(53_394);
        club.getCapacity();
        System.out.printf("Stadium Capacity is: %d", club.getCapacity());
        System.out.println();

        club.setSquadList("""
                Alison Becker
                Adrian
                Caoimhin Kelleher
                Joe Gomez
                Virgil van Dijk
                Ibrahim Konate
                Joel Matip
                Andy Robertson
                Trent Alexander-Arnold
                Kostas Tsimikas
                Calvin Ramsay
                Nathaniel Philips
                Fabinho
                Jordan Henderson
                Naby Keita
                James Milner
                Curtis Jones
                Thiago Alcantara
                Harvey Elliot
                Alex Oxlade-Chamberlain
                Arthur Melo
                Roberto Firmino
                Mohamed Salah
                Diogo Jota
                Luiz Diaz
                Darwin Nunez
                Fabio Carvalho""");
        result = club.getSquadList();
        System.out.printf("Squad List: %s%n",result);
        System.out.println();

    }
}