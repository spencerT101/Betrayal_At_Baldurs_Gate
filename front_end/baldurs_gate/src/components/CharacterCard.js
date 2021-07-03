import React, {useState, useEffect} from 'react';



function CharacterCard({heroes}) {
const HeroList = ({heroes}) => {

    const heroItems=heroes.map((hero, index) =>{
        return <ListItem hero = {hero} key = {index}/>
    })

    const HeroDetail = ({selectedHero}) =>{



    return(

        <>
         <p> {heroItems} </p>
        </>
        )


    }
}
}

export default CharacterCard;