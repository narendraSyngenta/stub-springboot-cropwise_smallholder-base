# Cropwise Smallholder API Stub

### Getting Started
1. clone this repo;
2. import in STS;
3. run.

The app will be listening on `port: 8080`

### Examples
Find sample requests on `Cropwise SmallHolder API Stub.postman_collection.json` file, in the root folder.

Set the `id` environment variable with differente integer values to understand how "Hello World" API is working.

[GET] `/api/hello-world` accepts query parameters "param1" and "param2" - both of type `string` - and logs them on the console.

[GET] `/api/hello-world/{{id}}` returns a dummy object with the `id` input.

[PUT] `/api/hello-world/{{id}}` returns the exact payload sent, if valid.

### Contributing
Try to follow the suggested package structure and classes' naming convention:

com <br>
└─ syngenta <br>
  └─ cropwise <br>
    └─ smallholder <br>
      └─ stub <br>
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
