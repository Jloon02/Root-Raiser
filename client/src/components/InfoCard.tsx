import { useState } from "react";
import { Map } from "google-maps-react";
import {
  Avatar,
  Badge,
  Box,
  Button,
  Card,
  CardBody,
  CardFooter,
  CardHeader,
  ChakraProvider,
  Flex,
  Heading,
  IconButton,
} from "@chakra-ui/react";
import { Autocomplete, Option } from "chakra-ui-simple-autocomplete";
import { BiLike, BiChat, BiShare } from "react-icons/bi";
import { StarIcon } from "@chakra-ui/icons";



import {
  useJsApiLoader,
  GoogleMap,
  Marker,
  DirectionsRenderer,
} from '@react-google-maps/api'

import { SetStateAction, useRef} from 'react'

const center = { lat: 49.1, lng: -122.2945 }
const InfoCard = () => {
  const property = {
    imageUrl: "https://upload.wikimedia.org/wikipedia/commons/8/89/Tomato_je.jpg",
    imageAlt: "tomatoes",
    title: "Fresh tomatoes",
    formattedPrice: "$4",
    reviewCount: 20,
    rating: 4,
  };

  return (
    <Box maxW="8xl" borderWidth="1px" borderRadius="lg" overflow="hidden" display="flex">
      <Box p="6">
        <Box display="flex" alignItems="baseline">
          <Badge borderRadius="full" px="2" colorScheme="teal">
            New
          </Badge>

        </Box>

        <Box w="100%" mt="3" fontWeight="semibold" as="h1" lineHeight="tight" noOfLines={1}>
          {property.title}
        </Box>

        <Box>
          {property.formattedPrice}
          <Box as="span" color="gray.600" fontSize="sm">
            / mo
          </Box>
        </Box>

        <Box display="flex" mt="2" alignItems="center">
          {Array(5)
            .fill("")
            .map((_, i) => (
              <StarIcon key={i} color={i < property.rating ? "teal.500" : "gray.300"} />
            ))}
          <Box as="span" ml="2" color="gray.600" fontSize="sm">
            {property.reviewCount} reviews
          </Box>
        </Box>
      </Box>
      <Box w='100%'>
        <img src={property.imageUrl} alt={property.imageAlt} />
      </Box>
    </Box>
  );
};
export default InfoCard;
