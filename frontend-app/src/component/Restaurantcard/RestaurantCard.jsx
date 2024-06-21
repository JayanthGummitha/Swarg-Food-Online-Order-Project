import { Card, Chip, IconButton } from '@mui/material'
import React from 'react'
import FavoriteIcon from '@mui/icons-material/Favorite';
import FavoriteBorderIcon from '@mui/icons-material/FavoriteBorder';

const RestaurantCard = () => {
  return (
    <Card className=' w-[18rem]'>
        <div className={`${true?'cursor-pointer':"cursor-not-allowed"} relative`}>
                <img
                className='w-full h-[10rem] rounded-t-md object-cover' 
                src="https://content.jdmagicbox.com/comp/indore/n2/0731px731.x731.170922125429.x5n2/catalogue/mitti-cafe-old-palasia-indore-coffee-shops-gdycwhpsbs.jpg"/>
                <Chip 
                size='small'
                className='absolute top-2 left-2'
                color={true?"success":"error"}
                label={true?"Open":"Closed"}
                />

                
        </div>
        <div className='p-4 textPart lg:flex w-full justify-between'>
            <div className='space-y-1'>
                <p className='font-semibold text-sm'> 
                     Indian Fast Food
                </p>
                <p className='text-gray-500 text-sm'>

                Craving it all? Dive into our global fla...
                </p>
            </div>
        <div>
            <IconButton>
                {true?<FavoriteIcon/>:<FavoriteBorderIcon/>}
            </IconButton>
        </div>
        </div>

    </Card>
  )
}

export default RestaurantCard