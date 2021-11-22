package com.company;

public class main {

    public static void main ( String[] arg) {
        Boss a1 = new Boss();
        a1.setDamage(15);
        a1.setHealth(800);
        a1.setSword("sword");
        System.out.println(a1.getDamage());
        System.out.println(a1.getHealth());
        System.out.println(a1.getSword());
        Hero[] heroes = createHeroes();

        for (int i = 0; i < heroes.length  ; i++) {
            System.out.println(heroes[i].getDamage() + heroes[i].getHealth() + heroes[i]. getSuperPower());
            System.out.println("String" +  10);
            
        }


    }
    public static Hero[] createHeroes(){
        Hero magic = new Hero(160, 20, "darkness");
        Hero physical = new Hero(200, 15);
        Hero dragon = new Hero(260,20);
        return new Hero[]{magic, physical, dragon};


    }

}




