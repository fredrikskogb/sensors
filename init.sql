CREATE TABLE IF NOT EXISTS customer (
    id SERIAL PRIMARY KEY,
    "name" VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS cluster (
    id SERIAL PRIMARY KEY,
    customer_id INTEGER NOT NULL,
    "name" VARCHAR(255) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);

CREATE TABLE IF NOT EXISTS central_unit (
    id SERIAL PRIMARY KEY,
    cluster_id INTEGER NOT NULL,
    "name" VARCHAR(255) NOT NULL,
    FOREIGN KEY (cluster_id) REFERENCES cluster(id)
);

CREATE TABLE IF NOT EXISTS sensor (
    id SERIAL PRIMARY KEY,
    central_unit_id INTEGER NOT NULL,
    expected_value DOUBLE PRECISION NOT NULL,
    value DOUBLE PRECISION NOT NULL,
    FOREIGN KEY (central_unit_id) REFERENCES central_unit(id)
);

CREATE TABLE sensor_history (
    sensor_id INTEGER NOT NULL,
    central_unit_id INTEGER NOT NULL,
    value DOUBLE PRECISION,
    expected_value DOUBLE PRECISION,
    time TIMESTAMP,
    PRIMARY KEY (sensor_id, central_unit_id)
);

INSERT INTO customer (id, "name")
VALUES
    (1, 'Customer A');

INSERT INTO cluster (id, customer_id, "name")
VALUES
    (1, 1, 'Cluster 1');

INSERT INTO central_unit (id, cluster_id, "name")
VALUES
    (1, 1, 'Central Unit 1');

INSERT INTO sensor (id, central_unit_id, expected_value, value)
VALUES
    (1, 1, 22.0, 20.5),
    (2, 1, 23.0, 25.3),
    (3, 1, 21.5, 20.0);