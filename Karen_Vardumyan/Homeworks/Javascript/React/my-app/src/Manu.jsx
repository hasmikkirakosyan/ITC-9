import React, { Component } from 'react';


var manuData = [ {image: "./vegetables.jpg", name: "MEAL1"},
                 {image: "./vegetables.jpg", name: "MEAL2"},
                 {image: "./vegetables.jpg", name: "MEAL3"} ]



class Manu extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            data: manuData

        };
    }
    render() {
        return (
            <div id="divManu">
                <div className="divDinner">
                    <img src={this.state.data[0].image} id="image1" className="menuImages"/>
                    <h3 className="dinners"> {this.state.data[0].name} </h3>
                </div>
                <div className="divDinner">
                    <img src={this.state.data[1].image} id="imag1" className="menuImages"/>
                    <h3 className="dinners"> {this.state.data[1].name} </h3>
                </div>

                <div className="divDinner">
                    <img src={this.state.data[2].image} id="imae1" className="menuImages"/>
                    <h3 className="dinners"> {this.state.data[2].name} </h3>
                </div>
            </div>
        );
    }
}

export default Manu;
