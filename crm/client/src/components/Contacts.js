import React, { Component } from 'react';
import SingleContact from './SingleContact';
import AddContacts from './AddContacts';

export default class Contacts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            contacts: [],
        };
    }

    componentDidMount() {
        fetch('http://localhost:8080/api/contacts')
        .then(respose => respose.json())
        .then(data => {
        const contacts = data._embedded ? data._embedded.contacts : [];
        this.setState({ contacts });
        })
    }

    render() {
        return (
            <div>
                <div className='row'>
                    <AddContacts />
                </div>
                <div className='row'>
                    { this.state.contacts.map((item) => (
                        <SingleContact key={item.id} item={item} />
                    ))}
                </div>
            </div>
        )
    }
}