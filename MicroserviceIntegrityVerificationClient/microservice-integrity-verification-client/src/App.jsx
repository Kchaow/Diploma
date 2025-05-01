import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
// import Graph from './graph/Graph';
import Main from './pages/main/Main';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="*" element={<Main />}/>
        <Route path="/graph/:graphId" element={<Main />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;