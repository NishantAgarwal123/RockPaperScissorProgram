package com.example.kotlinbasics

fun main(){
    var computerChoice = ""
    var playerChoice =""

    println("rock, paper or scissor ?!\nEnter your choice:")
    playerChoice= readln()
    playerChoice=playerChoice.lowercase()
    while(playerChoice != "rock" && playerChoice!= "scissor" && playerChoice!="paper"){
        println("enter valid option!!")
        playerChoice= readln().lowercase()
    }

    var randomNumber = (1..3).random()
//    switch. theres no switch in kotlin!! haha
//    instead use when (shaktiman)
    if(randomNumber==1)
        computerChoice="rock"
    else if (randomNumber==2)
        computerChoice="paper"
    else
        computerChoice="scissor"
    println("computer chose $computerChoice")

    /* alternate way to do so
    when ((1..3).random()) {
        1 -> computerChoice="rock"
        2 -> computerChoice="paper"
        else -> computerChoice="scissor"
    }*/

    var  winner= when{
        playerChoice==computerChoice-> "tie"
        playerChoice=="rock" && computerChoice=="scissor"->"player"
        playerChoice=="paper" && computerChoice=="rock"->"player"
        playerChoice=="scissor" && computerChoice=="paper"->"player"
//        playerChoice !in "rock", "paper","scissor"->"invalid choice"
        else->"computer"
    }

    if (winner=="tie")
        println("its a tie")
    else
        println("$winner won!!")

}