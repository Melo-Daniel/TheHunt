/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehunt;

import byui.cit260.curiousWorkmanship.model.Game;
import byui.cit260.curiousWorkmanship.model.Hunter;
import byui.cit260.curiousWorkmanship.model.InventoryItem;
import byui.cit260.curiousWorkmanship.model.Location;
import byui.cit260.curiousWorkmanship.model.Map;
import byui.cit260.curiousWorkmanship.model.Player;
import byui.cit260.curiousWorkmanship.model.Question;
import byui.cit260.curiousWorkmanship.model.QuestionScene;
import byui.cit260.curiousWorkmanship.model.RegularSceneType;
import byui.cit260.curiousWorkmanship.model.ResourceScene;
import byui.cit260.curiousWorkmanship.model.Weapon;

/**
 *
 * @author Daniel Melo
 */
public class TheHunt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game game = new Game();
        Hunter hunter = new Hunter();
        InventoryItem inventory  = new InventoryItem();
        Location location = new Location();
        Map map = new Map();
        Player player = new Player();
        Question question = new Question();
        QuestionScene questionScene = new QuestionScene();
        RegularSceneType sceceType = new RegularSceneType();
        ResourceScene resourceScene = new ResourceScene();
        Weapon weapon = new Weapon();
        
        game.setNoPeopple(true);
        game.setTotalTime(1000);
        System.out.println(game);
        
        hunter.setDescripdtion("This is the best hunter ever born");
        hunter.setDx(10);
        hunter.setDy(20);
        hunter.setLevel(5);
        hunter.setName("Daniel");        
        System.out.println(hunter);
        
        inventory.setInventoryType(2);
        inventory.setQuantityInStock(20);
        inventory.setRequiredAmount(20);
        System.out.println(inventory);
        
        location.setAmountRemaining(100);
        location.setColumn(2);
        location.setRow(5);
        location.setVisited(false);
        System.out.println(location);
        
        map.setColumnCount(2000);
        map.setRowCount(2000);
        map.setDescription("I have no idea");
        System.out.println(map);
        
        player.setName("Daniel");
        player.setBestScore(100000000);
        System.out.println(player);
        
        question.setQuestion("What is the meaning of life?");
        question.setAnswer("To reach the last level");
        System.out.println(question);
        
        questionScene.setNoToAnswer(true);
        questionScene.setBonus(200);
        System.out.println(questionScene);
        
        sceceType.setBloked(false);
        sceceType.setSymbol("The coolest");
        sceceType.setDescription("The ultimate scene");
        System.out.println(sceceType);
        
        resourceScene.setAmount(20);
        System.out.println(resourceScene);
        
        weapon.setDemage(2.5);
        weapon.setPrecision(5.4);
        System.out.println(weapon);
    }
    
}
