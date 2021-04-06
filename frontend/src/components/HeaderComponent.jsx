import React, { Component } from 'react';

class HeaderComponent extends Component {
    //navbar navbar-expand-md navbar-dark bg-dark
    //className="navbar-brand"
    render() {
        return (
            <div>
                <header>
                    <nav className="navbar navbar-expand-md navbar-dark bg-dark">
                        <div>
                            <a href="http://localhost:3000" className="navbar-brand">Hunt Randomizer</a>
                        </div>
                    </nav>
                </header>
            </div>
        );
    }
}

export default HeaderComponent;