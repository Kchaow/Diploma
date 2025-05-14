export const getGraph = (id) => {
    return id ?
    fetch(`http://localhost:8081/api/v1/change-graph/${id}`, {
        method: 'GET'
    })
    .then(response => response.json()) :
    fetch('http://localhost:8081/api/v1/graph', {
        method: 'GET'
    })
    .then(response => response.json())
}

export const getChangeGraphs = () => {
    return fetch(`http://localhost:8081/api/v1/change-graph`)
    .then(response => response.json());
}