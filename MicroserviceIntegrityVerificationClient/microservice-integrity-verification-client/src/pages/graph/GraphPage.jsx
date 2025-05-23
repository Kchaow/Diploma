import { Fragment, useEffect, useState} from "react";
import { useParams } from 'react-router-dom';
import Graph from "./Graph";
import Display from "./Display";
import * as api from '../../api/MicroserviceVerificationAPI';

const GraphPage = () => {
    const { graphId } = useParams();
    const [data, setData] = useState(null);

    useEffect(() => {
        api.getGraph(graphId).then(data => {
            console.log(data);
            setData(data);
        })
            .catch(err => console.log(err.message));
    }, [])

    return <Fragment>
        <div style={{height: '75vh'}} ><Graph graphData={data} /></div>
        <div style={{height: '25vh'}} ><Display graphData={data} /></div>
    </Fragment>
}

export default GraphPage;