import React, {useState, useEffect} from 'react';
import CardListItem from './CardListItem';


function GameCard({omenCardShuffle}) {

    if(omenCardShuffle.length == 0){
        return "loading";
    }
    console.log(omenCardShuffle)
    const omenCardItems = omenCardShuffle[0]
    
    // ((omenCard, index) => {
    //     return <CardListItem omenCard={omenCard} key={index} />
    // })


    return (

        <>
            <p> {omenCardItems.name} </p>
            <p> {omenCardItems.flavourText} </p>
        </>
    )


}

export default GameCard;


