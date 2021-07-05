import React, {useState, useEffect} from 'react';
import CardListItem from './CardListItem';


function GameCard({omenCardShuffle}) {

    if(omenCardShuffle.length == 0){
        return "loading";
    }
  
    const omenCardItems = omenCardShuffle[0]
    



    return (

        <>
            <p> {omenCardItems.name} </p>
            <p> {omenCardItems.flavourText} </p>
        </>
    )


}

export default GameCard;


