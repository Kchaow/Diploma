export const getGraph = (id) => {
    return id ?
    fetch(`http://localhost:8081/api/v1/graph/${id}`, {
        method: 'GET'
    })
    .then(response => response.json()) :
    fetch('http://localhost:8081/api/v1/graph', {
        method: 'GET'
    })
    .then(response => response.json())
}