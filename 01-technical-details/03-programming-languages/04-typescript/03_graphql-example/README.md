# TypeScript GraphQL Example

This is a simple example demonstrating how to set up a GraphQL server using TypeScript and Apollo Server.

## Prerequisites

- Node.js installed

## Getting Started

1. Install dependencies:
   ```bash
   npm install
   ```

2. Start the development server:
   ```bash
   npm start
   ```

3. Open your browser and navigate to `http://localhost:4000/` to access the Apollo Sandbox, where you can run GraphQL queries.

## Example Query

You can try the following query in the Apollo Sandbox:

```graphql
query GetBooks {
  books {
    title
    author
  }
}
```

## Structure

- `src/index.ts`: The main entry point containing the GraphQL schema (`typeDefs`) and the resolver logic.
