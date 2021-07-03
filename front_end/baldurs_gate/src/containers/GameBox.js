import React, {useState, useEffect} from 'react';
import AttackButton from '../components/AttackButton';
import CharacterCard from '../components/CharacterCard';
import MoveButton from '../components/MoveButton';
import TextBox from '../components/TextBox';
import DiceRoll from '../components/DiceRoll';
import CharacterStats from '../components/CharacterStats';



import "../components/css/main.css";


function GameBox() {


    return(
        <>
        <main id="main-box">
        <p>I am the game box!</p>
        <MoveButton id="move-button"/>
        <AttackButton id="attack-button"/>
        <CharacterCard id="char-card"/>
        <TextBox id="text-box"/>
        <DiceRoll id="dice-rolls"/>
        <CharacterStats id="char-stats"/>

        </main>
           

        </>
    )

}

export default GameBox;