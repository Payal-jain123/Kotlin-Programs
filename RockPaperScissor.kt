package com.example.rockpaperscissors

import kotlin.random.Random

fun main(){
    var computerChoice=""
    var playerChoice=""
    println("Rock,Paper or Scissors? Enter Your Choice!")
    playerChoice= readln()
    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice="Rock"
        }
        2 -> {
            computerChoice="Paper"
        }
        3 -> {
            computerChoice="Scissors"
        }
    }
println(computerChoice)

    val winner = when {
        playerChoice==computerChoice->"Tie"
        playerChoice=="Rock" && computerChoice=="Scissors"->"Player"
        playerChoice=="Paper" && computerChoice=="Rock"->"Player"
        playerChoice=="Scissors" && computerChoice=="Paper"->"Player"

        else ->"Computer"



    }
    if(winner=="Tie"){
        println("It's a Tie!")
    }else if(winner=="Player"){
        println("Player Won!")
    }else{
        println("Computer Won!")
    }
}