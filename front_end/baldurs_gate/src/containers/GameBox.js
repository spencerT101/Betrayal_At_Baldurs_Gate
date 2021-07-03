import React, {useState, useEffect} from 'react';
import AttackButton from '../components/AttackButton';
import CharacterCard from '../components/CharacterCard';
import MoveButton from '../components/MoveButton';
import TextBox from '../components/TextBox';
import DiceRoll from '../components/DiceRoll';
import CharacterStats from '../components/CharacterStats';
import TileDisplayPic from "../components/TileDisplayPic";
import GameCard from "../components/GameCard";
import "../components/css/main.css";


function GameBox() {

    const [heroes, setHeroes] = useState([])

  useEffect(() => {
    fetchHeroesApi()
    
  }, [])

 

 const fetchHeroesApi= function(){
   fetch("http://localhost:8080/api/heroes")
  .then(response => response.json())
   .then(heroes => setHeroes(heroes))
   
 }



    return(
        <>
        <main>
     
        
        <div id = "tile-display">
            <TileDisplayPic/>
        </div>
       <div id = "middle-layer">
           <TextBox/>
           <CharacterCard heroes={heroes}/>
           <GameCard/>
       </div>
        
        
        <div id="bottom-layer">
            <MoveButton className="button"/>
            <AttackButton className="button"/>
            <DiceRoll id="dice-rolls"/>
            <CharacterStats id="char-stats"/>
        
        </div>
        </main>
           

        </>
    )

}

export default GameBox;