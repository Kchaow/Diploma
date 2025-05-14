import React, { useState, useEffect } from 'react';
import './ChangeGraphsPage.css';
import * as api from '../../api/MicroserviceVerificationAPI';

function GraphPanel({ data }) {
  const isDone = data.status === 'DONE';
  const PanelContent = (
    <>
      <div className="graph-id">{data.id}</div>
      <div className="graph-stats">
        {data.commitedMicroservices} / {data.associatedMicroservices}
      </div>
      {!isDone && <div className="status-badge">{data.status}</div>}
    </>
  );

  return (
    <div className={`graph-panel-container ${isDone ? '' : 'disabled'}`}>
      {isDone ? (
        <a href={`/graph/${data.id}`} className="graph-link">
          {PanelContent}
        </a>
      ) : (
        <div className="graph-link disabled">
          {PanelContent}
        </div>
      )}
    </div>
  );
}

function ChangeGraphsPage() {
    const [graphsData, setGraphsData] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        api.getChangeGraphs().then(data => {
            console.log(data);
            setGraphsData(data);
            setLoading(false);
        })
            .catch(err => console.log(err.message));
    }, []);

    if (loading) return <div className="loading">Loading...</div>;
    if (error) return <div className="error">Error: {error}</div>;

    return (
    <div className="app-container">
      <h1>Графы изменений</h1>
      <div className="graphs-list">
        {graphsData.map((graph) => (
          <GraphPanel key={graph.id} data={graph} />
        ))}
      </div>
    </div>
    );
}

export default ChangeGraphsPage;