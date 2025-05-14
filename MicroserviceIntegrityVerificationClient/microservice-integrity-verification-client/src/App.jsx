import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import GraphPage from './pages/graph/GraphPage';
import ChangeGraphsPage from './pages/changeGraphs/ChangeGraphsPage';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="*" element={<GraphPage />}/>
        <Route path="/graph/:graphId" element={<GraphPage />} />
        <Route path="/change-graph" element={<ChangeGraphsPage />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;