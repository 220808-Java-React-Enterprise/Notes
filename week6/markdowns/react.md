# Introduction into React

## SPA: single page application
    - Single page application is an web application that receives all its html/css/js pages in the first request. In subsequent page changes, instead of loading a brand new page, it swaps out part of the page to create a new view. In that sense, there is only "one page" in the application

### Pros?
    - We only need to make one request to get all of our html/css/js assets
    - code reuse
    - subsequent "page loads" are quicker - json is much lighter to transport than html/css/js assets

### Cons?
    - Initial load can be slower because we're getting all our assets in one go
    - initial learning curve/overhead with toolings

---

## REACT Commands

- Creating a REACT problem with typescript template
  - `npx create-react-app <name of project> --template typescript`


- Add routing to our REACT project
  - `npm i react-router-dom`

- Add axios to our REACT project
  - `npm i react-axios`

