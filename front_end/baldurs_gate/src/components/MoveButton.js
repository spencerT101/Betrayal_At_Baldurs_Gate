import React, {useState, useEffect} from 'react';

function MoveButton({fetchShuffledOmenCard, moveCharacterLeft}) {


    return (
        <>
            <button onClick={fetchShuffledOmenCard} className="button">Left</button>
            <button onClick={fetchShuffledOmenCard} className="button" >Right</button>
            <button onClick={fetchShuffledOmenCard} className="button">Up</button>
            <button onClick={fetchShuffledOmenCard} className="button">Down</button>
        </>
    )


}

export default MoveButton;