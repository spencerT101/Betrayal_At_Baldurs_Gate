import React, {useState, useEffect} from 'react';
import CardListItem from './CardListItem';


function GameCard({omenCardShuffle}) {

    if(omenCardShuffle.length == 0){
        return "loading";
    }
  
    const omenCardItems = omenCardShuffle[0]
    

    return (

        <>
        <div className="card-text">
            <p> {omenCardItems.name} </p>
            <p> {omenCardItems.flavourText} </p>
            <p> Might: {omenCardItems.might} </p>
            <p> {omenCardItems.might} </p>
        </div>
        </>
    )


}

export default GameCard;


