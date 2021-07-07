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
import "../components/css/text-box.css";


function GameBox() {

    const [heroes, setHeroes] = useState([])
    const [scroll, setScroll] = useState([])
    const [omenCardShuffle, setOmenCardShuffle] = useState([])
    const [startGame, setStartGame] = useState([])
    const [characterLeft, setCharacterLeft] = useState([])
    // const [characterLeft, setCharacterLeft] = useState([])
    // const [characterLeft, setCharacterLeft] = useState([])
    // const [characterLeft, setCharacterLeft] = useState([])

    useEffect(() => {
        fetchHeroesApi()
        fetchScroll()
        fetchShuffledOmenCard()
        fetchStartGame()
        moveCharacterLeft()
    }, [])

    const fetchStartGame = function () {
        fetch("http://localhost:8080/api/start")
            .then(response => response.text())
            .then(startGame => setStartGame(startGame))
    }

    const fetchShuffledOmenCard = function () {
        fetch("http://localhost:8080/api/cards")
            .then(response => response.json())
            .then(omenCardShuffle => setOmenCardShuffle(omenCardShuffle))
    }

    const moveCharacterLeft = function () {
        fetch("http://localhost:8080/api/move/1")
            .then(response => response.text())
            .then(characterLeft => setCharacterLeft(characterLeft))
    }



    const fetchHeroesApi = function () {
        fetch("http://localhost:8080/api/heroes")
            .then(response => response.json())
            .then(heroes => setHeroes(heroes))

    }

    const fetchScroll = function () {
        fetch("http://localhost:8080/api/scroll")
            .then(response => response.text())
            .then(data => setScroll(data))
    }

    return (
        <>
            <main id="main">

                <div id="tile-display">
                    <TileDisplayPic />
                </div>

                <div id="middle-layer">
                    <TextBox characterLeft={characterLeft} />
                    <CharacterCard heroes={heroes} />
                    <GameCard omenCardShuffle={omenCardShuffle} />
                </div>

                <div id="bottom-layer">
                    <MoveButton className="button" fetchShuffledOmenCard={fetchShuffledOmenCard} moveCharacterLeft={moveCharacterLeft} />
                    <AttackButton className="button" />
                    <DiceRoll id="dice-rolls" startGame={startGame} />
                    <CharacterStats id="char-stats" />
                </div>




            </main>
        </>
    )

}

export default GameBox;