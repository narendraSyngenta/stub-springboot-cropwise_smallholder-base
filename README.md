# Cropwise Smallholder API Stub

## Getting Started
1. clone this repo;
2. import in STS;
3. turn on SonarLint;
3. run.

The app will be listening on `port: 8080`

For testing in AWS environment, `Basic Auth` is required:<br>
`base url`: `http://stubcropwisesmallholder-env.eba-wtsypmxs.us-east-2.elasticbeanstalk.com`<br>
`username`: `frontend`<br>
`password`: `FFrNnU99G3GNBNaU`<br>

## Examples
Find sample requests on `Cropwise SmallHolder API Stub.postman_collection.json` file, in the root folder.

Set the `id` environment variable with differente integer values to understand how "Hello World" API is working.

[GET] `/api/hello-world` accepts query parameters "param1" and "param2" - both of type `string` - and logs them on the console.

[GET] `/api/hello-world/{{id}}` returns a dummy object with the `id` input.

[PUT] `/api/hello-world/{{id}}` returns the exact payload sent, if valid.

## Contributing

### Version Control

- Git-flow-like, _checking out from_ / _merging to_ branch `main` - there's no "develop" branch, since it's a simple project;
- 1 reviewer required;
- Be gentle in the comments when code reviewing;
- Test the changes before merging.

### Commiting
- Keep commits short - it facilitates code reviewing, since it's easy to match the code with its intention;
- Follow [these guidelines](https://chris.beams.io/posts/git-commit/); no need to be too strict, but make sure to respect rule #5.

### CI/CD
- SonarCloud is disabled for now, but new code with _smells_ or _warnings_ must be rejected.

Try to follow the suggested package structure and classes' naming convention:

com.syngenta.cropwise.smallholder.stub <br>
  └─ api <br>
    └─ helloworld <br>
      └─ controller <br>
        └─ HelloWord**Controller**.java <br>
      └─ data <br>
        └─ request <br>
          └─ GetAll**QueryParams**.java <br>
    ├─ **[your API's base resource]** <br>
      └─ controller <br>
        └─ **[resource name]-Controller**.java <br>
      └─ data <br>
        └─ request <br>
          └─ **[method name]-QueryParams**.java <br>
          └─ **[method name]-Body** (when you need to validate the payload structure) <br>

Feel free to propose conventions for unforeseen cases or to update existing ones.

