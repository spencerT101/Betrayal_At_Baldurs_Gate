import React, {useState, useEffect} from 'react';
import AttackButton from '../components/AttackButton';
import CharacterCard from '../components/CharacterCard';
import GameBoard from '../components/GameBoard';
import MoveButton from '../components/MoveButton';
import Canvas from '../components/Canvas'
import TestGameBoard from '../components/TestGameBoard';


function GameBox() {


    return(
        <>
        <main>
        <p>I am the game box!</p>
        <GameBoard/>
        <MoveButton/>
        <AttackButton/>
        <CharacterCard/>
       
        
        </main>
           

        </>
    )

}

export default GameBox;