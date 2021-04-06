import React, { Component } from "react";
import Switch from "react-switch";
import NumericInput from "react-numeric-input";

class LoadoutComponent extends Component {
  constructor(props) {
    super(props);

    this.state = {
      primary: {},
      secondary: {},
      tools: [],
      consumables: [],
      quarterMaster: false,
      fullLoadout: false,
      level: 100,
    };
    this.onQuarterSwitchChange = this.onQuarterSwitchChange.bind(this);
    this.onFullSwitchChange = this.onFullSwitchChange.bind(this);
    this.onNumericChange = this.onNumericChange.bind(this);
    this.randomLoadout = this.randomLoadout.bind(this);
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

  onQuarterSwitchChange(checked) {
    console.log("quartermaster > " + checked);
    this.setState({ quarterMaster: checked });
  }

  onFullSwitchChange(checked) {
    console.log("full loadout > " + checked);
    this.setState({ fullLoadout: checked });
  }

  onNumericChange(num) {
    console.log("level > " + num);
    this.setState({ level: num });
  }

  randomLoadout() {
      // TODO: axios GET request
      console.log("RANDOM LOADOUT >");
  }

  render() {
    return (
      <div>
        <div className="container" style={{ marginTop: "20px" }}>
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

              <div className="row" style={{ marginTop: "10px" }}>
                <label>
                  <span style={{ fontSize: "20px", padding: "5px" }}>
                    Quartermaster
                  </span>
                  <Switch
                    onChange={this.onQuarterSwitchChange}
                    checked={this.state.quarterMaster}
                    height={18}
                    width={48}
                  />
                </label>
                <label>
                  <span style={{ fontSize: "20px", padding: "5px" }}>
                    Full loadout
                  </span>
                  <Switch
                    onChange={this.onFullSwitchChange}
                    checked={this.state.fullLoadout}
                    height={18}
                    width={48}
                  />
                </label>
                <label>
                  <span style={{ fontSize: "20px", padding: "5px" }}>
                    Level
                  </span>
                  <NumericInput
                    min={1}
                    max={100}
                    value={this.state.level}
                    size={1}
                    onChange={this.onNumericChange}
                  />
                </label>
              </div>
              {/* How to center a button inside a div... */}
              <div style={{ display: "flex", justifyContent: "center" }}>
                <div>
                  <button
                    className="btn btn-danger"
                    onClick={this.randomLoadout}
                  >
                    Random loadout
                  </button>
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
