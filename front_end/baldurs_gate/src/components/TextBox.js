import React, {useState, useEffect} from 'react'
import "./images/scroll-portrait.png"


function TextBox({characterPosition}) {

    return (
        <>
            <div className="text-box">{characterPosition}</div>
        </>
    )

}

export default TextBox;

