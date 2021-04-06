import React, { Component } from "react";

class LoadoutComponent extends Component {
  constructor(props) {
    super(props);

    this.state = {
      primary: {},
      secondary: {},
      tools: [],
      consumables: [],
    };
  }

  componentDidMount() {
    // Mock data
    this.setState({
      primary: { name: "Nitro Express" },
      secondary: { name: "Dolch 96" },
      tools: [
        { name: "knife" },
        { name: "medkit" },
        { name: "flare" },
        { name: "decoy" },
      ],
      consumables: [
        { name: "vitality shot" },
        { name: "vitality shot" },
        { name: "frag bomb" },
        { name: "concertina bomb" },
      ],
    });
  }

  render() {
    return (
      <div>
        <div className="container" style={{ marginTop: "20px" }}>
          <div className="row">
            <div className="card col-md-6 offset-md-3 offset-md-3">
              <h2 className="text-center">Random Loadout Generator</h2>
              <div className="card-body">
                <div className="border" style={{ marginTop: "5px" }}>
                  <label>Weapons:</label>
                  <div className="col">
                    <label>{this.state.primary.name}</label>
                  </div>
                  <div className="col">
                    <label>{this.state.secondary.name}</label>
                  </div>
                </div>

                <div className="border" style={{ marginTop: "5px" }}>
                  <label>Tools:</label>
                  <div className="col">
                    {this.state.tools.map((item) => (
                      <div>{item.name}</div>
                    ))}
                  </div>
                </div>

                <div className="border" style={{ marginTop: "5px" }}>
                  <label>Consumables:</label>
                  <div className="col">
                    {this.state.consumables.map((item) => (
                      <div>{item.name}</div>
                    ))}
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default LoadoutComponent;
