import React, {useState, useEffect} from 'react';

function MoveButton() {

    // const left = "localhost:8080/api/move/left"
    // const right = "localhost:8080/api/move/right"
    // const up = "localhost:8080/api/move/up"
    // const down = "localhost:8080/api/move/down"

    // const moveLeft = function () {
    //     fetch(left)
    //         .then(response => response.text())
    //         .then(data => setText(data))
    // }

    // const [text, setText] = useState([])

    // useEffect(() => {
    //     setText()

    // }, [])

    // const handleClick = (event) => {
    //     onMoveButtonClick(event)
    // }


    return (
        <>
            {/* <button onClick={move} className="button">Left</button> */}
            <button className="button" >Right</button>
            <button className="button">Up</button>
            <button className="button">Down</button>
        </>
    )


}

export default MoveButton;