import React, {useState, useEffect} from 'react'
import "./images/scroll-portrait.png"


function TextBox({scroll}) {

    return (
        <>
            <div className="game-text">{scroll}</div>
        </>
    )


}

export default TextBox;

