/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

import Board.*;


/**
 *
 * @author magdalenafernlund
 */
public class Dragon extends Monster{

    private int bodypoint; 
    private int damage; 
    
    public Dragon() {
        this.bodypoint = 18;
        this.damage = 1;
    }
    
    @Override
    public String getName(){
        return "dragon";
    }
    
    
    
    
    
   public static void printDragon(){
        System.out.println(
"                                                           .~))>>\n"+
"                                                          .~)>>\n"+
"                                                      .~))))>>>\n"+
"                                                   .~))>> ___\n"+
" .~))>>)))>> .-~))>>\n"+
" .~)))))>> .-~))>>)>\n"+
" .~)))>>))))>> .-~)>>)>\n"+
" ) .~))>>))))>> .-~)))))>>)>\n"+
" ( )@@*) //)>)))))) .-~))))>>)>\n"+
" ).@(@@ //))>>))) .-~))>>)))))>>)>\n"+
" (( @.@). //))))) .-~)>>)))))>>)>\n"+
" )) )@@*.@@ ) //)>))) //))))))>>))))>>)>\n"+
" (( ((@@@.@@ |/))))) //)))))>>)))>>)>\n"+
" )) @@*. )@@ ) (\\_(\\-\\b |))>)) //)))>>)))))))>>)>\n"+
" (( @@@(.@(@ . _/`-` ~|b |>))) //)>>)))))))>>)>\n"+
" )* @@@ )@* (@) (@) /\\b|))) //))))))>>))))>>\n"+
" (( @. )@( @ . _/ / / \\b)) //))>>)))))>>>_._\n"+
" )@@ (@@*)@@. (6///6)- / ^ \\b)//))))))>>)))>> ~~-.\n"+
" ( @jgs@@. @@@.*@_ VvvvvV// ^ \\b/)>>))))>> _. `bb\n"+
" ((@@ @@@*.(@@ . - | o |' \\ ( ^ \\b)))>> .' b`,\n"+
" ((@@).*@@ )@ ) \\^^^/ (( ^ ~)_ \\ / b `,\n"+
" (@@. (@@ ). `-' ((( ^ `\\ \\ \\ \\ \\| b `.\n"+
" (*.@* / (((( \\| | | \\ . b `.\n"+
" / / ((((( \\ \\ / _.-~\\ Y, b ;\n"+
" / / / (((((( \\ \\.-~ _.`\" _.-~`, b ;\n"+
" / / `(((((() ) (((((~ `, b ;\n"+
" _/ _/ `\"\"\"/ /' ; b ;\n"+
" _.-~_.-~ / /' _.'~bb _.'\n"+
" ((((~~ / /' _.'~bb.--~\n"+
" (((( __.-~bb.-~\n"+
" .' b .~~\n"+
" :bb ,' \n"+
" ~~~~\n"
);
   }
    
    
}
