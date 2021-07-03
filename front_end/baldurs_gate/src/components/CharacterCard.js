import React, {useState, useEffect} from 'react';
import ListItem from './ListItem';



const CharacterCard = ({heroes}) => {

    const heroItems = heroes.map((hero, index) => {
        return <ListItem hero={hero} key={index} />
    })




    return (

        <>
            <p> {heroItems} </p>
        </>
    )



}


export default CharacterCard;