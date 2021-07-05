import React, {useState, useEffect} from 'react';
import CardListItem from './CardListItem';


function GameCard({omenCardShuffle}) {

    if(omenCardShuffle.length == 0){
        return "loading";
    }
    
    if (omenCardShuffle.might !=undefined)
        return 
  
    const omenCardItems = omenCardShuffle[0]
    

    return (

        <>
        <div className="text-box">
            <p className="text"> {omenCardItems.name} </p>
            <p className="text"> {omenCardItems.flavourText} </p>
            <p className="text"> {omenCardItems.might} </p>
        </div>
        </>
    )


}

export default GameCard;


