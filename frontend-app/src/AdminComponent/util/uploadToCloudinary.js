const upload_preset =""
const cloud_name =""
const api_url=""

export const uploadImageToCloudinary= async (file)=>{
    const data=new FormData();
    data.append("file",file);
    data.append("upload_preset",upload_preset);
    data.append("cloud_name",cloud_name);

    const res = await fetch(api_url,{
        method:"post",
        body: data
    })

    const fileData= await res.json();
    return fileData.url;

}